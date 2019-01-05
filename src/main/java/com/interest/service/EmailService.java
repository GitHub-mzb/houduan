package com.interest.service;

import com.interest.model.EmailEntity;

import java.util.List;

public interface EmailService {

	public void insertEntity(EmailEntity emailEntity);

	public List<EmailEntity> emailsList(int pageSize, int start);

	public Integer emailsSize(int pageSize, int start);

    public void deleteEmails(List<String> groupId);
}
