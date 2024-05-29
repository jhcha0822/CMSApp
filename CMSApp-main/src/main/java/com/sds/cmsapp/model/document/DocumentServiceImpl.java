package com.sds.cmsapp.model.document;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.cmsapp.domain.Document;
import com.sds.cmsapp.domain.VersionLog;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	private DocumentDAO documentDAO;

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List selectAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document select(int document_idx) {
		Document document = documentDAO.select(document_idx);
		return document;
	}
	
	public void insert(VersionLog versionLog) {
		documentDAO.insert(versionLog);
	}

}
