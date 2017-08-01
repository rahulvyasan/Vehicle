package com.rahul.DaoImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.rahul.domain.Car;

public class CarRowMapper implements RowMapper<Car> {
	public Car mapRow(ResultSet rs, int rownum) throws SQLException {
		Car car= new Car();
		car.setId(rs.getInt("car_id"));
		car.setCarName(rs.getString("car_name"));
		car.setCarValue(rs.getInt("car_value"));
		car.setStartEngine(rs.getString("car_engine"));
		car.setRunning(rs.getBoolean("car_running"));
		return car;
		
	}

}
