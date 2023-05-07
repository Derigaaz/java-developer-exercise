package com.pietrowski.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubstanceUpdateEntry extends Substance {
    private List<String> updatedHazardClasses;
    private List<String> updatedHazardStatementCodes;
    private LocalDateTime updateTime;
}