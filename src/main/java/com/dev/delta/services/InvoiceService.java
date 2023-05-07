package com.dev.delta.services;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Invoice;
import com.dev.delta.entities.VAT;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.VATRepository;
import com.dev.delta.util.DateBlogUtil;

@Service
public class InvoiceService {

	@Autowired
	VATRepository vatRepository;

	public double calculateSubTotalPrice(InvoiceRepository invoiceRepository,CheckIn check) throws ParseException {
		double res = 0;
		long days=DateBlogUtil.diff2dates(check.getCheckIn(), check.getCheckOut());
		for (Invoice i : invoiceRepository.findByCheckIn(check)) {
			res += Double.parseDouble(i.getPrice());
		}
		return res*days;
	}

	public double calculatetotalPrice(InvoiceRepository invoiceRepository,CheckIn checkin) throws NumberFormatException, ParseException {

		VAT v = vatRepository.findById(1L).get();
		double res = 0;
		res = calculateSubTotalPrice(invoiceRepository,checkin) * Double.parseDouble(v.getRate()) / 100;

		return (calculateSubTotalPrice(invoiceRepository,checkin) + res);
	}

	public double calculatevatrate(InvoiceRepository invoiceRepository,CheckIn check) throws NumberFormatException, ParseException {

		VAT v = vatRepository.findById(1L).get();
		double res = 0;
		res = calculateSubTotalPrice(invoiceRepository,check) * Double.parseDouble(v.getRate()) / 100;

		return res;
	}

}
