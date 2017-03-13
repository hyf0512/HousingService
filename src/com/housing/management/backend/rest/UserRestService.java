package com.housing.management.backend.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.User;
import com.housing.management.backend.service.one.UserService;

@Controller
@RequestMapping({ "/user" })
public class UserRestService {

	private static final Logger logger = Logger.getLogger(UserRestService.class);

//	@Autowired
//	private LoginService loginService;

	@Autowired
	private UserService userService;
	
//	@Autowired
//	private UserGroupService userGroupService;
//	
//	@Autowired
//	private RoleService roleService;
//	
//	@Autowired
//	private TerminalService terminalService;
	
//	@Autowired
//	private RedisCacheService redisService;

//	@Autowired
//	private MenuService menuService;
	
//	@Autowired
//	private ConfigService configService;
	
	/**
	 * 用户登录验证，返回具体信息
	 * 
	 * @param userLogin
	 * 
	 * @result UserLogin
	 */
	@RequestMapping(value = { "/list/{userId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<User> getUserList(@PathVariable("userId") String userId, HttpServletRequest request, HttpServletResponse response) {
	
		return userService.getUserList(userId);
	}
	
//	/**
//	 * 用户登录验证，返回具体信息
//	 * 
//	 * @param userLogin
//	 * 
//	 * @result UserLogin
//	 */
//	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
//	@ResponseBody
//	public UserLoginVO login(@RequestBody UserLoginVO userLogin,
//			ServletRequest request, ServletResponse response) {
//		String return_code = userAuthService.validate(userLogin.getUserId(),
//				userLogin.getUserPassword(), "JAAS_LOGIN_MODULE", "").getCode();
//		
//		if (return_code.equalsIgnoreCase("1000")) {
//			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//
//			String osType = httpServletRequest.getHeader("os_type");
//			String terminalId = httpServletRequest.getHeader("device_id");
//
//			// TODO check terminalId
////			int cnt = terminalService.getTerminal(terminalId, String.valueOf(Constants.VALID));
////			if(cnt<=0){
////				//没有找到设备
////				throw new BusinessException(
////						Constants.ERROR_CODE.ERR_LOGIN_ISSUE.getValue(),
////						"terminal not authorized");
////			}
//		
//			// 判断登录
//			List<Login> loginList = loginService.checkLogin(userLogin.getUserId());
//			Login login = new Login();
//			login.setUserId(userLogin.getUserId());
//			login.setOSType(osType);
//			boolean firstIn = true;
//			if (loginList.isEmpty()) {
//				// 用户不存在
//				throw new BusinessException(
//						Constants.ERROR_CODE.ERR_LOGIN_ISSUE.getValue(),
//						"user not exist");
//			}else{
//				for(Login item : loginList){
//					login.setId(item.getId());
//					login.setUserName(item.getUserName());
//					login.setOuCode(item.getOuCode());
//					if(osType.equals(item.getOSType())){
//						//检查是否是首次登陆，若找到，则不是
//						//不同OS系统可以登录，相同OS则前者securityToken失效
//						firstIn = false;
//						break;
//					}
//				}
//			}
//
//			login.setTerminalId(terminalId);
//			login.setLoginTime(new Date());
//			login.setIsOnline(1);
//			String securityToken = Utils.generateToken(login.getUserId()
//					+ System.currentTimeMillis());
//			login.setSecurityToken(securityToken);
//			login.setTokenExpire(Utils.getTokenExpireTime());
//			logger.info(login);
//			if(firstIn){
//				//首次登陆
//				loginService.createLogin(login);
//			}else{
//				loginService.updatelogin(login);
//			}
//
//			UserLoginVO userLogined = new UserLoginVO();
//			userLogined.setUserName(login.getUserName());
//			userLogined.setSecurityToken(securityToken);
//			userLogined.setOuCode(login.getOuCode());
//			
//			//put token in redis cache
//			redisService.setValueWithExpireTime(Constants.REDIS_KEY_HEADER_TOKEN+login.getUserId(), securityToken, Constants.REDIS_TOKEN_LIVE_TIME);
//			
//			return userLogined;
//		} else {
//			throw new BusinessException(
//					Constants.ERROR_CODE.ERR_LOGIN_ISSUE.getValue(),
//					Constants.RESPONSE_CODE.getName(Integer.parseInt(return_code)));
//		}
//	}
//
//	/**
//	 * 用户修改密码
//	 * 
//	 * @param userChangePW
//	 * 
//	 * @result ResponseResultVO
//	 */
//	@RequestMapping(value = { "/changePassword" }, method = { RequestMethod.PUT })
//	@ResponseBody
//	public ResponseResultVO changePassword(@RequestBody UserChangePWVO userChangePW) {
//		String userId = userChangePW.getUserId();
//		User user = userService.getUserByID(userId);
//		ResponseResultVO rsVo = new ResponseResultVO();
//		if(null==user || user.getValid()==Constants.INVALID){
//			//本地数据库中没有相关用户，或用户无效
//			rsVo.setStatus(false);
//			rsVo.setErrCode("1001");
//			rsVo.setErrMsg("Username is not exist");
//			return rsVo;
//		}
//		String oldPassword = userChangePW.getOldPassword();
//		String newPassword = userChangePW.getNewPassword();
//		ResponseResult rs = userAuthService.modifyPwd(userId, oldPassword, newPassword);
//		
//		rsVo.setStatus(rs.isResult());
//		rsVo.setErrCode(rs.getCode());
//		rsVo.setErrMsg(rs.getInfo());
//		return rsVo;
//	}
//	
//	/**
//	 * 保存用户信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(method = RequestMethod.POST )
//	@ResponseBody
//	public ResponseResultVO updateUser(@RequestBody User user) {
//		ResponseResultVO response = new ResponseResultVO();
//		try{
//			userService.insert(user);
//			response.setStatus(true);
//		} catch(Exception e){
//			logger.error(e.getMessage(), e); 
//			response.setStatus(false);
//		}
//		return response;
//	}
//	
//	/**
//	 * 删除用户信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(value = { "/{userId}" }, method = RequestMethod.DELETE )
//	@ResponseBody
//	public ResponseResultVO deleteUser(@PathVariable String userId) {
//		ResponseResultVO response = new ResponseResultVO();
//		try{
//			userService.delete(userId);
//			response.setStatus(true);
//		} catch(Exception e){
//			logger.error(e.getMessage(), e); 
//			response.setStatus(false);
//		}
//		return response;
//	}
//	
//	/**
//	 * 查询用户组信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(value = { "/userGroupList/{userId}" }, method = RequestMethod.GET )
//	@ResponseBody
//	public List<UserGroup> getUserGroupList(@PathVariable String userId) {
//		return userGroupService.getUserGroupsByUser(userId);
//	}
//	
//	/**
//	 * 查询用户组信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(value = { "/roleList/{userId}" }, method = RequestMethod.GET )
//	@ResponseBody
//	public List<Role> getRoleList(@PathVariable String userId) {
//		return roleService.getRolesByUser(userId);
//	}
//	
//	/**
//	 * 返回用户信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(value = { "/search" }, method = { RequestMethod.POST })
//	@ResponseBody
//	public PageHolder<User> getUserFuzzy(@RequestBody User user) {
//		Utils.pageDataInit(user);
//		if(user.getUserGroupList()==null|| user.getUserGroupList().isEmpty())user.setUserGroupList(null);
//		if(user.getRoleList()==null||user.getRoleList().isEmpty())user.setRoleList(null);
//		List<User> list = userService.getUsersFuzzy(user);
//		PageHolder<User> pageHolder = new PageHolder<User>();
//		pageHolder.setPageIndex(user.getPageIndex());
//		pageHolder.setPageSize(user.getPageSize());
//		pageHolder.setPageTotal(userService.getUsersFuzzyCount(user));
//		pageHolder.setRows(list);
//		return pageHolder;
//	}
//	
//	/**
//	 * 返回用户信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(value = { "/{userId}" }, method = { RequestMethod.GET })
//	@ResponseBody
//	public InitialVO getInitialInfo(@PathVariable String userId) {
//		InitialVO initialVO = new InitialVO();
//		initialVO.setUser(userService.getUserByID(userId));
//		initialVO.setMenuList(menuService.getAuthedChildrenMenus(userId));
//		initialVO.setLeftbarList(menuService.getLeftBars(userId));
//		return initialVO;
//	}
//	
//	/**
//	 * 返回用户组信息
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	@RequestMapping(value = { "/usergroup" }, method = { RequestMethod.POST })
//	@ResponseBody
//	public List<User> getUserGrouped(@RequestBody User user) {
//		return userService.getUsersGrouped(user);
//	}
//	
//	/**
//	 * 检查用户是否重复
//	 * 
//	 * @param userId
//	 * 
//	 * @result int
//	 */
//	@RequestMapping(value = { "/checkuserid/{userId}" }, method = { RequestMethod.GET })
//	@ResponseBody
//	public int checkUserId(@PathVariable String userId) {
//		return userService.checkUserId(userId);
//	}
//	/**
//	 * 根据营业所获取主任信息
//	 * @param salesOfficeId
//	 * @return
//	 */
//	@RequestMapping(value={"/getSupervisorData/{salesOfficeId}"}, method = { RequestMethod.GET })
//	@ResponseBody
//	public List<MappingVO> getSupervisorData(@PathVariable String salesOfficeId){
//		return userService.getSupervisorData(salesOfficeId);
//	}
}
