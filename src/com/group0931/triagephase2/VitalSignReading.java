package com.group0931.triagephase2;

import java.io.Serializable;

/**
 * A vital sign reading of a {@code PatientVisit}.
 * @author Christina Chung, Asher MindenWebb, Angel You.
 *
 */
public abstract class VitalSignReading implements Serializable{

	/**
	 * Returns the date and time of this {@code VitalSignReading}.
	 * @return The date and time of this {@code VitalSignReading}.
	 */
	public abstract TimeStamp getReadingTime();
	
	/**
	 * Calculates and returns the urgency point of this {@code VitalSignReading} 
	 * based on the hospital policy.
	 * @return The urgency point of this {@code VitalSignReading}.
	 */
	public abstract int calculateUrgencyPoint();

	/**
	 * Returns the urgency point of this {@code VitalSignReading} based on the 
	 * hospital policy.
	 * @return The urgency point of this {@code VitalSignReading}.
	 */
	public abstract int getUrgency();
	
	public abstract String getReadingAsString();

}
