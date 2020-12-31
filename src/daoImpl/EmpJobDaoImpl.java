package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import config.JDBCConnection;
import dao.IEmpJobDao;
import model.EmpJob;


public class EmpJobDaoImpl {

Connection conn=null;
	
	public EmpJobDaoImpl() {
		conn=JDBCConnection.getDBConnection();
	}

	@Override
	public List<EmpJob> getAllEmpJob() {
		List<EmpJob> empjobList=new ArrayList<EmpJob>();
		try {
			String query="select * from EmpJob";
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery(query);
			if(rst!=null) {
				
				while(rst.next()) {
					EmpJob empjob=new EmpJob();
					empjob.setEJIId(rst.getInt(1));
					empjob.setEmployeeId(rst.getInt(2));
					empjob.setJobId(rst.getInt(3));
					empjob.setRecruited(rst.getInt(4));
					empjobList.add(empjob);
				}
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return empjobList;
	}

	@Override
	public void addEmpJob(EmpJob empjob) {
		try {
			String query="insert into EmpJob(EJId, EmployeeId, JobId, Recruited) values(?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setInt(1,empjob.getEJId());
			pst.setInt(2,empjob.getEmployeeId());
			pst.setInt(3,empjob.getJobId());
			pst.setInt(4,empjob.getRecruited());;
			int i=pst.executeUpdate();
			if(i==1) {
				System.out.println("1 record inserted...");
			}
			else {
				System.out.println("Insertion failed...");
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
	}

	@Override
	public EmpJob getEmpJobById(int id) {
		EmpJob empjob=new EmpJob();
		try {
			String query="select * from EmployeeJob where EJIId=?";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setInt(1,id);
			ResultSet rst=pst.executeQuery();
			if(rst!=null) {
				while(rst.next()) {
					empjob.setEJId(rst.getInt(1));
					empjob.setEmployeeId(rst.getInt(2));
					empjob.setJobId(rst.getInt(3));
					empjob.setRecuried(rst.getInt(4));
				}
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return empjob;
	}

	@Override
	public void updateEmpJob(EmpJob empjob) {
		try {
			String query = "UPDATE EmpJob SET EmployeeId=?, JobId=? WHERE EJId=?";
		
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, empjob.getEmployeeId());
			statement.setInt(2, empjob.getJobId());	 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}
			else {
				System.out.println("updation failed...");
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
	}

	@Override
	public void deactivateEmpJob(EmpJob empjob) {
			
	}
	
	@Override
	public void activateEmpJob(EmpJob empjob) {
				
	}

	@Override
	public void deleteEmpJob(int id) {
		try {
			//creating PreparedStatement object by passing query string
			PreparedStatement pst=conn.prepareStatement("delete from EmpJob where EJId=?");
			pst.setInt(1, id);
			int i=pst.executeUpdate();
			if(i==1){
				System.out.println("EmpJob deleted...");
			}
			else {
				System.out.println("deletion failed...");
			}
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}	
		
	}
	
	
}


