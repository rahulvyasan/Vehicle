package com.rahul.DaoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.rahul.dao.CarDao;
import com.rahul.domain.Car;

@Repository
public class CarDaoImpl implements CarDao {
	
	private NamedParameterJdbcTemplate namedParamJdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		
		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean create(Car car) {
		SqlParameterSource beanParams = new BeanPropertySqlParameterSource(car);
		String sqlQuery="INSERT INTO vehicle (car_name,car_value,car_engine,car_running)"
                + "VALUES(?,?,?,?,?)";
return namedParamJdbcTemplate.update(sqlQuery,beanParams)==1;
		
	}

	@Override
	public Car getCar(Integer id) {
		SqlParameterSource params = new MapSqlParameterSource("ID", id);
		String sqlQuery= "SELECT id,car_name,car_value,car_engine,car_running " +
                "FROM vehicle WHERE car_id=?";
Car car=namedParamJdbcTemplate.queryForObject(sqlQuery, params,new CarRowMapper());
return car;
	}
	@Override
	public List<Car> getAllCars() {
		String sqlQuery="SELECT * FROM vehicle";
		List<Car> carList = namedParamJdbcTemplate.query(sqlQuery, new CarRowMapper());
		return carList;
	}

	@Override
	public boolean delete(Car car) {
		SqlParameterSource beanParams = new BeanPropertySqlParameterSource(car);
		String sqlQuery = "DELETE FROM vehicle WHERE car_id=?";
		
		return namedParamJdbcTemplate.update(sqlQuery,beanParams)==1;
	}

	@Override
	public boolean update(Car car) {
		SqlParameterSource beanParams = new BeanPropertySqlParameterSource(car);		
		String sqlQuery= "UPDATE vehicle SET car_name = ? WHERE car_id = ?";
		return namedParamJdbcTemplate.update(sqlQuery,beanParams) == 1;
	}

}
