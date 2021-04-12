package io.mosip.kernel.masterdata.service;

import io.mosip.kernel.masterdata.dto.WeekDaysResponseDto;
import io.mosip.kernel.masterdata.dto.WorkingDaysResponseDto;

public interface RegWorkingNonWorkingService {

	WeekDaysResponseDto getWeekDaysList(String regCenterId);

	WorkingDaysResponseDto getWorkingDays(String regCenterId);
	
	WorkingDaysResponseDto getWorkingDaysByLangCode(String langCode);

}
