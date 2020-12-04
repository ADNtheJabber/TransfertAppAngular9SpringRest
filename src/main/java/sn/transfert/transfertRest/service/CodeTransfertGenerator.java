package sn.transfert.transfertRest.service;

import sn.transfert.transfertRest.dao.ITransfert;

public class CodeTransfertGenerator {

	private ITransfert transfertRepository;
	
	public String codegen(String date) {
		
		//get id of last inserted row, keeping documented
		
		int random = (int)(Math.random() * 100 + 1);

		String code ="00"+"-"+date+"_"+random;
		return code;
		
//		if (transfertRepository.findByCodeTransfert(code)code=null) {
//			
//			return code;
//
//		}
		
	}
}
