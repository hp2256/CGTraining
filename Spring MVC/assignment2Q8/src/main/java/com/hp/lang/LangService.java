package com.hp.lang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LangService {

	@Autowired
	private LangRepositry langRepositry;

	public void setEmployeeRepositry(LangRepositry langRepositry) {
		this.langRepositry = langRepositry;
	}
}
