package com.apap.backend_tu.service;

import com.apap.backend_tu.model.JenisSuratModel;

import java.util.List;

public interface JenisSuratService {
	List<JenisSuratModel> getAllJenisSurat();

	void updateJenisSurat(long id, JenisSuratModel jenisSurat);

	void deleteJenisSurat(long id);

	JenisSuratModel getJenisSuratById(long id);

	JenisSuratModel addJenisSurat(JenisSuratModel jenisSurat);

	boolean validatenama(String username);
}
