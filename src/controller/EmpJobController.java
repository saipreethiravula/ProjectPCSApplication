package controller;

import java.util.List;

import dao.IEmpJobDao;
import daoImpl.EmpJobDaoImpl;
import model.EmpJob;

public class EmpJobController {
    IEmpJobDao empjobDao=null;
	
	public EmpJobController() {
		empjobDao=new EmpJobDaoImpl();
	}
	
	public List<EmpJob> getAllEmpJob(){
		List<EmpJob> empList=empjobDao.getAllEmpJob();
		return empList;
	}
	
	public void addEmpJob(EmpJob empjob) {
		empjobDao.addEmpJob(empjob);
	}
	public EmpJob getEmpJobById(int id) {
		EmpJob empjob=empjobDao.getEmpJobById(id);
		return empjob;
	}
	public void updateEmpJob(EmpJob empjob) {
		empjobDao.updateEmpJob(empjob);
	}
	public void deleteEmpJob(int id) {
		empjobDao.deleteEmpJob(id);
	}
	public void deactivateEmpJob(EmpJob empjob) {
		empjobDao.deactivateEmpJob(empjob);
	}
	public void activateEmpJob(EmpJob empjob) {
		empjobDao.activateEmpJob(empjob);
	}
}


