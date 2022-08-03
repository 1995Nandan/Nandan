package com.xworkz.job.dao;

import com.xworkz.job.dto.JobDto;

public interface JobDao {
boolean save(JobDto jobDto);
JobDto findByIdAndDesignation(Integer id,String designantion);

}
