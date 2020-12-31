package controller;

import java.util.List;

import dao.IJobDao;
import daoImpl.JobDaoImpl;
import model.Job;

public class JobController {
    IJobDao jobDao=null;
	
	public JobController() {
		jobDao=new JobDaoImpl();
	}
	
	public List<Job> getAllJob(){
		List<Job> jobList=jobDao.getAllJob();
		return jobList;
	}
	
	public void addJob(Job j) {
		jobDao.addJob(j);
	}
	public Job getJobById(int id) {
		Job j=jobDao.getJobById(id);
		return j;
	}
	public void updateJob(Job j) {
	     jobDao.updateJob(j);
	}
	public void deleteJob(int id) {
	      jobDao.deleteJob(id);
	}
	public void deactivateJob(Job j) {
		jobDao.deactivateJob(j);
	}
	public void activateJob(Job j) {
		jobDao.activateJob(j);
	}
}


