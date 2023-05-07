package com.dev.delta;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.dev.delta.dto.AmenityDTO;
import com.dev.delta.dto.BedDTO;
import com.dev.delta.dto.BlogCategoryDTO;
import com.dev.delta.dto.BlogDTO;
import com.dev.delta.dto.CheckInDTO;
import com.dev.delta.dto.CityDTO;
import com.dev.delta.dto.CountryDTO;
import com.dev.delta.dto.CurrencyDTO;
import com.dev.delta.dto.CustomerDTO;
import com.dev.delta.dto.DepartementDTO;
import com.dev.delta.dto.DesignationDTO;
import com.dev.delta.dto.EmailDTO;
import com.dev.delta.dto.EmployeeDTO;
import com.dev.delta.dto.ExpenseCategoryDTO;
import com.dev.delta.dto.ExpenseDTO;
import com.dev.delta.dto.ExtraBedDTO;
import com.dev.delta.dto.ExtraBedOrderDTO;
import com.dev.delta.dto.ExtraBedRequestDTO;
import com.dev.delta.dto.FoodCategoryDTO;
import com.dev.delta.dto.FoodDTO;
import com.dev.delta.dto.FoodOrderDTO;
import com.dev.delta.dto.FoodRequestDTO;
import com.dev.delta.dto.GalleryDTO;
import com.dev.delta.dto.GuestTypeDTO;
import com.dev.delta.dto.HeaderDTO;
import com.dev.delta.dto.HouseKeepingOrderDTO;
import com.dev.delta.dto.HouseKeepingRequestDTO;
import com.dev.delta.dto.HousekeepingItemDTO;
import com.dev.delta.dto.InformationHotelDTO;
import com.dev.delta.dto.LaundryItemDTO;
import com.dev.delta.dto.LaundryOrderDTO;
import com.dev.delta.dto.LaundryRequestDTO;
import com.dev.delta.dto.MenuDTO;
import com.dev.delta.dto.MessageDTO;
import com.dev.delta.dto.OfferDTO;
import com.dev.delta.dto.PaymentDTO;
import com.dev.delta.dto.PaymentMethodDTO;
import com.dev.delta.dto.RoleDTO;
import com.dev.delta.dto.RoomDTO;
import com.dev.delta.dto.RoomTypeDTO;
import com.dev.delta.dto.ShiftDTO;
import com.dev.delta.dto.SubscriberDTO;
import com.dev.delta.dto.UserDTO;
import com.dev.delta.dto.VatDTO;
import com.dev.delta.dto.WebsiteDTO;
import com.dev.delta.services.InformationService;

@SpringBootApplication
public class SpringbootHotelResidenceCodecanyonApplication implements CommandLineRunner {

	@Autowired
	UserDTO userDTO;

	@Autowired
	InformationHotelDTO informationHotelDTO;

	@Autowired
	CheckInDTO checkInDTO;

	@Autowired
	RoomTypeDTO roomTypeDTO;

	@Autowired
	AmenityDTO amenityDTO;

	@Autowired
	GuestTypeDTO guestTypeDTO;

	@Autowired
	CityDTO cityDTO;

	@Autowired
	CountryDTO countryDTO;

	@Autowired
	BlogDTO blogDTO;

	@Autowired
	CustomerDTO customerDTO;

	@Autowired
	RoomDTO roomDTO;

	@Autowired
	ExtraBedDTO extraBedDTO;

	@Autowired
	BedDTO bedDTO;

	@Autowired
	ExpenseDTO expenseDTO;

	@Autowired
	ExpenseCategoryDTO expenseCategoryDTO;

	@Autowired
	FoodCategoryDTO foodCategoryDTO;

	@Autowired
	FoodDTO foodDTO;

	@Autowired
	ShiftDTO shiftDTO;

	@Autowired
	DesignationDTO designationDTO;

	@Autowired
	BlogCategoryDTO blogCategoryDTO;

	@Autowired
	GalleryDTO galleryDTO;

	@Autowired
	OfferDTO offerDTO;

	@Autowired
	EmailDTO emailDTO;

	@Autowired
	CurrencyDTO currencyDTO;

	@Autowired
	RoleDTO roleDTO;

	@Autowired
	WebsiteDTO websiteDTO;

	@Autowired
	InformationService informationService;

	@Value("${system.lang}")
	String lang;

	@Autowired
	MenuDTO menuDTO;
	// Read server.port from app.prop

	@Autowired
	HeaderDTO headerDTO;

	@Autowired
	SubscriberDTO subscriberDTO;

	@Autowired
	PaymentDTO paymentDTO;

	@Autowired
	PaymentMethodDTO paymentMethodDTO;

	@Autowired
	HousekeepingItemDTO housekeepingItemDTO;

	@Autowired
	ExtraBedOrderDTO extraBedOrderDTO;

	@Autowired
	FoodOrderDTO foodOrderDTO;

	@Autowired
	HouseKeepingOrderDTO houseKeepingOrderDTO;

	@Autowired
	LaundryOrderDTO laundryOrderDTO;

	@Autowired
	LaundryItemDTO laundryItemDTO;

	@Autowired
	EmployeeDTO employeeDTO;

	@Autowired
	DepartementDTO departementDTO;

	@Autowired
	FoodRequestDTO foodRequestDTO;

	@Autowired
	ExtraBedRequestDTO extraBedRequestDTO;

	@Autowired
	HouseKeepingRequestDTO houseKeepingRequestDTO;

	@Autowired
	LaundryRequestDTO laundryRequestDTO;

	@Autowired
	MessageDTO messageDTO;

	@Autowired
	VatDTO vatDTO;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHotelResidenceCodecanyonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		roleDTO.populate();
		userDTO.populate();
		blogCategoryDTO.populate();
		amenityDTO.populate();
		informationHotelDTO.populate();
		roomTypeDTO.populate();
		guestTypeDTO.populate();
		cityDTO.populate();
		countryDTO.populate();
		blogDTO.populate();
		customerDTO.populate();
		roomDTO.populate();
		extraBedDTO.populate();
		bedDTO.populate();
		expenseCategoryDTO.populate();
		expenseDTO.populate();
		foodCategoryDTO.populate();
		foodDTO.populate();
		shiftDTO.populate();
		designationDTO.populate();
		galleryDTO.populate();
		offerDTO.populate();
		emailDTO.populate();
		currencyDTO.populate();
		websiteDTO.populate();
		checkInDTO.populate();
		menuDTO.populate();
		headerDTO.populate();
		subscriberDTO.populate();
		paymentDTO.populate();
		paymentMethodDTO.populate();
		housekeepingItemDTO.populate();
		extraBedOrderDTO.populate();
		foodOrderDTO.populate();
		houseKeepingOrderDTO.populate();
		laundryOrderDTO.populate();
		laundryItemDTO.populate();
		employeeDTO.populate();
		departementDTO.populate();
		foodRequestDTO.populate();
		extraBedRequestDTO.populate();
		houseKeepingRequestDTO.populate();
		laundryRequestDTO.populate();
		messageDTO.populate();
		vatDTO.populate();

	}

	/**
	 * 
	 * @return
	 */

	@Bean
	public SessionLocaleResolver localeResolver() {
		Locale arabicLocale = new Locale.Builder().setLanguageTag("ar-SA-u-nu-arab").build();
		SessionLocaleResolver slr = new SessionLocaleResolver();
		if (lang.equals("en")) {
			slr.setDefaultLocale(Locale.ENGLISH);
		} else if (lang.equals("ar")) {

			slr.setDefaultLocale(arabicLocale);
		}

		return slr;
	}

}
