package com.system.batch.killbatchsystem;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;

public class SystemDestructionValidator implements JobParametersValidator {

  @Override
  public void validate(JobParameters parameters) throws JobParametersInvalidException {
    if(parameters == null) {
      throw new JobParametersInvalidException("JobParameters is null");
    }

    Long destructionPower = parameters.getLong("destructionPower");
    if(destructionPower == null) {
      throw new JobParametersInvalidException("DestructionPower is null");
    }

    if(destructionPower > 9){
      throw new JobParametersInvalidException("파괴력 수준이 허용치를 초과했습니다: " + destructionPower + "(최대 허용치: 9");
    }
  }
}
