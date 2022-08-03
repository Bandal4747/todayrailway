package com.bookticket.TodayRailways0022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.bookticket.TodayRailways0022.repositroy",
		"com.bookticket.TodayRailways0022.controller",
		"com.bookticket.TodayRailways0022.dto"})
@EntityScan({"com.bookticket.TodayRailways0022.entity"})
public class TodayRailways0022Application {

	public static void main(String[] args) {
		SpringApplication.run(TodayRailways0022Application.class, args);
	}

}
