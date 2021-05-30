package com.github.khaliullin.skyscanner.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.khaliullin.skyscanner.dto.browseflight.FlightPricesDto;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class SubscriptionDto {

    private Long id;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String country;

    @NotNull
    private String currency;

    @NotNull
    private String locale;

    @NotNull
    private String originPlace;

    @NotNull
    private String destinationPlace;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate outboundPartialDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate inboundPartialDate;

    private Integer minPrice;

    private FlightPricesDto flightPricesDto;

}
