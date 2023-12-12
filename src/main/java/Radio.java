public class Radio {
    private final int maxStation;
    private final int maxVolume = 100;
    private int currentVolume;
    private int currentStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }


    // Настройки станции
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        {
            if (currentStation < 0) {
                return;
            }
        }
        {
            if (currentStation > maxStation) {
                return;
            }
        }
        this.currentStation = currentStation;
    }

    public int nextStation() {
        {
            if (currentStation != maxStation) {
                currentStation++;

            } else currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        {
            if (currentStation != 0) {
                currentStation--;

            } else currentStation = maxStation;
        }
        return currentStation;
    }


    // Настройки громкости.

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        {
            if (currentVolume < 0) {
                return;
            }
        }
        {
            if (currentVolume > maxVolume) {
                return;

            }
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        {
            if (currentVolume != maxVolume) {
                currentVolume++;
            }
        }

    }

    public void decreaseVolume() {
        {
            if (currentVolume != 0) {
                currentVolume--;
            }
        }


    }
}



