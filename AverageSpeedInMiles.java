class AverageSpeedInMiles
{
    public static void main(String[] args)
    {
	double kilometer = 14;
	double kilometerToMiles = kilometer/1.6;
	double totalDistance = kilometerToMiles;
	double minute = 45;
	double minuteToHour = minute/60;
	double sec = 30;
	double secToHour = sec/(60*60);
	double totalTime = minuteToHour+secToHour;
	double averageSpeed = totalDistance/totalTime;
	System.out.println("The average speed of runner is "+averageSpeed + "miles per hour");
    }
}
