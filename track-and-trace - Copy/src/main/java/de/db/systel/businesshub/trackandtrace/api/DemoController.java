package de.db.systel.businesshub.trackandtrace.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import de.db.systel.businesshub.trackandtrace.Models.Train;
@RestController
public class DemoController implements TrainsApi {

	@Override
	public ResponseEntity<List<Train>> _getTrainsByNationalTrain(String country, String trainNumber,
			LocalDate productionDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
