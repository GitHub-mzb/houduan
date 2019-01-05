package com.interest.dao;

import com.interest.model.EmailEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmailDao {

	public void insertEntity(EmailEntity emailEntity);

	public List<EmailEntity> emailsList(@Param("pageSize") int pageSize, @Param("start") int start);

	public Integer emailsSize(@Param("pageSize") int pageSize, @Param("start") int start);

    public void deleteEmails(@Param("groupId") List<String> groupId);
}
