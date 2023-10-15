package edu.hw1;

public class Task1 {
    public int minutesToSeconds(String time) {
        String[] timeArray = time.split(":");
        if (timeArray.length != 2 || ("" + time.charAt(time.length() - 1)).equals(":")) {
            return -1;
        }
        String stringMinutes = timeArray[0];
        String stringSeconds = timeArray[1];
        try {
            int seconds = Integer.parseInt(stringSeconds);
            int minutes = Integer.parseInt(stringMinutes);
            final int SIXTY = 60;
            if (minutes >= 0 && seconds >= 0 && seconds < SIXTY) {
                return minutes * SIXTY + seconds;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}

