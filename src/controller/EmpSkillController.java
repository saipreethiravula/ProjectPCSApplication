package controller;

import java.util.List;

import dao.IEmpSkillDao;
import daoImpl.EmpSkillDaoImpl;
import model.EmpSkill;

public class EmpSkillController {

	 IEmpSkillDao empSkillDao=null;
		
		public EmpSkillController() {
			empSkillDao=new EmpSkillDaoImpl();
		}
		
		public List<EmpSkill> getAllEmpSkill(){
			List<EmpSkill> empList=empSkillDao.getAllEmpSkill();
			return empList;
		}
		
		public void addEmpSkill(EmpSkill empskill) {
			empSkillDao.addEmpSkill(empskill);
		}
		public EmpSkill getEmpSkillById(int id) {
			EmpSkill empskill=empSkillDao.getEmpSkillById(id);
			return empskill;
		}
		public void updateEmpSkill(EmpSkill empskill) {
			empSkillDao.updateEmpSkill(empskill);
		}
		public void deleteEmpSkill(int id) {
			empSkillDao.deleteEmpSkill(id);
		}
	}



