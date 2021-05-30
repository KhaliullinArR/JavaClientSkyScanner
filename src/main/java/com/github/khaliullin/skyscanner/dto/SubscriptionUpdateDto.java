package com.github.khaliullin.skyscanner.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class SubscriptionUpdateDto {


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

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate inboundPartialDate;

}
