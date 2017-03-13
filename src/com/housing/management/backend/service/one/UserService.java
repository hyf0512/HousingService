package com.housing.management.backend.service.one;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.UserDAO;
import com.housing.management.backend.domain.User;


@Service
public class UserService {

	private static final Logger logger = Logger.getLogger(UserService.class);

	@Autowired
	private UserDAO userDAO;
//	@Autowired
//	private RoleDAO roleDao;
//	@Autowired
//	private UserGroupDAO userGroupDAO;
//	@Autowired
//	private UserGroupMappingDAO userGroupMappingDAO;
//	
//	@Autowired
//	private UserRoleMappingDAO userRoleMappingDao;

	public List<User> getUserList(String userId) {
		return userDAO.getUserList(userId);		
	}
//	/**
//	 * 更新用户
//	 * 
//	 * @param paramUser
//	 * 
//	 * @result void
//	 */
//	public void insert(User user) {
//		User u = userDAO.getUserByID(user.getUserId());
//		if(null==u){
//			userDAO.insert(user);
//		} else{
//			userDAO.update(user);
//			userGroupMappingDAO.deleteByUser(user.getUserId());
//			userRoleMappingDao.deleteByUser(user.getUserId());
//		}
//		
//		//批量插入用户组信息
//		List<UserGroupMapping> grouplist = new ArrayList<UserGroupMapping>();
//		if(user.getUserGroupList() !=null){
//			for(UserGroup item : user.getUserGroupList()){
//				UserGroupMapping ur = new UserGroupMapping();
//				ur.setUserGroupId(item.getGroupId());
//				ur.setUserId(user.getUserId());
//				grouplist.add(ur);
//			}
//			if(null!=grouplist && !grouplist.isEmpty()){
//				userGroupMappingDAO.insertBatch(grouplist);
//			}
//		}
//		
//		//批量插入角色信息
//		List<UserRoleMapping> rolelist = new ArrayList<UserRoleMapping>();
//		if( user.getRoleList() !=null){
//			for(Role item : user.getRoleList()){
//				UserRoleMapping ur = new UserRoleMapping();
//				ur.setUserId(user.getUserId());
//				ur.setRoleId(item.getRoleId());
//				rolelist.add(ur);
//			}
//			if(null!=rolelist && !rolelist.isEmpty()){
//				userRoleMappingDao.insertBatch(rolelist);
//			}
//		}
//	}
//	
//	/**
//	 * 更新用户
//	 * 
//	 * @param paramUser
//	 * 
//	 * @result int
//	 */
//	public int update(User user) {
//		return userDAO.update(user);
//	}
//
//	/**
//	 * 更新用户
//	 * 
//	 * @param paramUser
//	 * 
//	 * @result int
//	 */
//	public int delete(String userId) {
//		return userDAO.delete(userId);
//	}
//	
//	/**
//	 * 查询用户
//	 * 
//	 * @param userId
//	 * 
//	 * @result User
//	 */
//	public User getUserByID(String id) {
//		return userDAO.getUserByID(id);
//	}
//	
//	/**
//	 * 查询用户
//	 * 
//	 * @param user
//	 * 
//	 * @result List<User>
//	 */
//	public List<User> getUsers(User user) {
//		return userDAO.getUsers(user);
//	}
//	
//	/**
//	 * 查询用户 用户组用
//	 * 
//	 * @param user
//	 * 
//	 * @result List<User>
//	 */
//	public List<User> getUsersGrouped(User user){
//		formateUser(user);
//		return userDAO.getUsersGrouped(user);
//	}
//	
//	/**
//	 * 检查用户是否重复
//	 * 
//	 * @param userId
//	 * 
//	 * @result int
//	 */
//	public int checkUserId(String userId) {
//		return userDAO.checkUserId(userId);
//	}
//	
//	/**
//	 * 查询用户 组织架构
//	 * 
//	 * @param user
//	 * 
//	 * @result List<User>
//	 */
//	public List<User> getUserbyOrgList(OrganizationListVO vo){
//		if(vo.getSalesOrganizationList() !=null && vo.getSalesOrganizationList().isEmpty()){
//			vo.setSalesOrganizationList(null);
//		}
//		if(vo.getSalesDistrictList() !=null && vo.getSalesDistrictList().isEmpty()){
//			vo.setSalesDistrictList(null);
//		}
//		if(vo.getSalesOfficeList() !=null && vo.getSalesOfficeList().isEmpty()){
//			vo.setSalesOfficeList(null);
//		}
//		if(StringUtils.isNotEmpty(vo.getSalesRepId())){
//			vo.setSalesRepId("%"+vo.getSalesRepId()+"%");
//		}
//		return userDAO.getUserbyOrgList(vo);
//	}
//	
//	/**
//	 * 查询用户 模糊查询
//	 * 
//	 * @param user
//	 * 
//	 * @result List<User>
//	 */
//	public List<User> getUsersFuzzy(User user){
//		//用户查询的时候,可以输入用户名字或账号，进行模糊查询
//		formateUser(user);
//		List<User> list = userDAO.getUsersFuzzy(user);
//		/*for(User u :list){
//			u.setUserGroupList(userGroupDAO.getUserGroupsByUser(u.getUserId()));
//			u.setRoleList(roleDao.getRolesByUser(u.getUserId()));
//		}*/
//		return list;
//	}
//	
//	/**
//	 * 查询用户数量 模糊查询
//	 * 
//	 * @param user
//	 * 
//	 * @result List<User>
//	 */
//	public int getUsersFuzzyCount(User user){
//		//用户查询的时候,可以输入用户名字或账号，进行模糊查询
//		formateUser(user);
//		return userDAO.getUsersFuzzyCount(user);
//	}
//	
//	/**
//	 * 物料主数据，SAP通过MQ过来，增量处理
//	 * 
//	 * @param msgTest
//	 * 
//	 * @result
//	 */
//	public void updateEmployeeMasterData(String empXml){
//		Document document = Utils.readXml(empXml,
//				Constants.EMP_SAP_DATA_NAMESPACE_URL,
//				Constants.EMP_SAP_DATA_NAMESPACE_KEY);
//		
//		List<NodeVO> empList = Utils.getNoteValList(document,
//				Constants.EMP_SAP_DATA_EMPLOYEELISTBODY);
//		
//		for (NodeVO item : empList) {
//			User user = new User();
//			boolean isNecessary = true;
//			String key = item.getKey();
//			if(key.equals(EMPLOYEE_DATA.EMP_SAP_DATA_EMPLOYEEHEADER
//					.getValue())){
//						//是人员信息
//				//员工号
//				String empId = Utils.getElementVal(item.getElement(), EMPLOYEE_DATA.EMP_SAP_DATA_PERNO.getValue());
//				user.setUserId(empId);
//				user.setEmployeeId(empId);
//				//姓
//				String empName = Utils.getElementVal(item.getElement(), EMPLOYEE_DATA.EMP_SAP_DATA_LAST_NAME.getValue());
//				//名字
//				empName += Utils.getElementVal(item.getElement(), EMPLOYEE_DATA.EMP_SAP_DATA_FIRSTNAME.getValue());
//				user.setUserName(empName);
//				List<NodeVO> orgList = Utils.getNextElementValList(item.getElement(), EMPLOYEE_DATA.EMP_SAP_DATA_EMPLOYEEORG.getValue());
//				for(NodeVO orgItem : orgList){
//					//Company Code
//					if(orgItem.getKey().equals(EMPLOYEE_DATA.EMP_SAP_DATA_COMP_CODE.getValue())){
//						user.setCompanyCode(orgItem.getValue());
//					} else if(orgItem.getKey().equals(EMPLOYEE_DATA.EMP_SAP_DATA_OBJ_NAME.getValue())){
//						if(!orgItem.getValue().startsWith("销售代表")){
//							//不需要插入数据库
//							isNecessary=false;
//							break;
//						}
//					} else if((orgItem.getKey().equals(EMPLOYEE_DATA.EMP_SAP_DATA_EMP_STAT.getValue()))){
//						if(orgItem.getValue().equals("0")){
//							//员工状态为0，表示离职，维护成invalid
//							user.setValid(1);
//						} else{
//							user.setValid(0);
//						}
//					}
//				}
//			}
//			//不需要插入数据库的数据，跳出循环，执行下一个message
//			if(!isNecessary){
//				continue;
//			}
//			user.setCreateUserId("Interface");
//			user.setUpdateUserId("Interface");
//			User userOut = userDAO.getUserByID(user.getUserId());
//			try{
//				//客户信息
//				if(userOut==null){
//					//所有插入的用户开始都置为无效客户
//					user.setValid(1);
//					userDAO.insert(user);
//				}else{
//					userDAO.updateMasterData(user);
//				}
//				
//			} catch(Exception e){
//				logger.error(e.getMessage());
//			}
//		}
//	}
//	/**
//	 * 根据营业所Id查询其主任数据
//	 * @param salesOfficeId
//	 * @return
//	 */
//	public List<MappingVO> getSupervisorData(String salesOfficeId){
//		return userDAO.getSupervisorData(salesOfficeId);
//	}
//	private void formateUser(User user){
//		String userId = user.getUserId();
//		if(StringUtils.isNotEmpty(userId)){
//			user.setUserInfo("%"+userId+"%");
//		}
//		user.setUserId("");
//	}
}
