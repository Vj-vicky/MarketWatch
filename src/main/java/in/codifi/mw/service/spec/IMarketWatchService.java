package in.codifi.mw.service.spec;

import org.jboss.resteasy.reactive.RestResponse;

import in.codifi.mw.model.ClinetInfoModel;
import in.codifi.mw.model.MWResponseModel;
import in.codifi.mw.model.MwCommodityContarctModel;
import in.codifi.mw.model.MwRequestModel;
import in.codifi.mw.model.ResponseModel;
import in.codifi.mw.model.SecurityInfoReqModel;

public interface IMarketWatchService {

	/**
	 * @author Vicky
	 * @param userId
	 * @return
	 */
	RestResponse<ResponseModel> createMW(String userId);

	/**
	 * @param pDto
	 * @return
	 */
	RestResponse<ResponseModel> renameMarketWatch(MwRequestModel pDto);

	/**
	 * @param pDto
	 * @return
	 */
	RestResponse<ResponseModel> sortMwScrips(MwRequestModel pDto);

	/**
	 * @param pDto
	 * @return
	 */
	RestResponse<ResponseModel> addscrip(MwRequestModel pDto);

	/**
	 * @param pDto
	 * @return
	 */
	RestResponse<ResponseModel> deletescrip(MwRequestModel pDto);

	/**
	 * @param userId
	 * @return
	 */
	RestResponse<ResponseModel> getAllMwScrips(String userId);

	/**
	 * @return
	 */
	RestResponse<ResponseModel> getIndices();

	/**
	 * @param pDto 
	 * @return
	 */
	RestResponse<ResponseModel> getcommodityContarct(MwCommodityContarctModel pDto);

	/**
	 * @param model
	 * @param info
	 * @return
	 */
	RestResponse<ResponseModel> getSecurityInfo(SecurityInfoReqModel model, ClinetInfoModel info);


}