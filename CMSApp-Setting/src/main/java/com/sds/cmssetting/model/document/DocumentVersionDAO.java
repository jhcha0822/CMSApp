package com.sds.cmssetting.model.document;

import org.apache.ibatis.annotations.Mapper;

import com.sds.cmssetting.domain.DocumentVersion;
import com.sds.cmssetting.domain.ResultDocCountDTO;

@Mapper
public interface DocumentVersionDAO {
			
	public ResultDocCountDTO selectCountByStatus(int statusCode);
	
	public int insert(final DocumentVersion documentVersion);
	
	public int updateStatusByDocumentIdx(final DocumentVersion documentVeresion);
	
	public int delete(final int documentVersionIdx);
	
	public int deleteByDocumentIdx(final int documentIdx);
	
	// DocumentVersionMap 반환
	public DocumentVersion selectByDocumentIdx(int documentIdx);

}
