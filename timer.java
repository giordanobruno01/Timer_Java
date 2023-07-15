class timer {

    public timer() {

    }

    // input 02:59:60
    public int[] decrease(int[] arr) {
        if (arr[1] == 0 && arr[0] != 0) {
            arr[0]--;
            arr[1] = 60;
        }
        if (arr[2] == 0 && arr[1] != 0) {
            arr[1]--;
            arr[2] = 60;
        }
        return arr;
    }

    public void countTime(String time) {
        String timeArr[] = time.split(":");
        int arr[] = new int[3];

        arr[0] = Integer.parseInt(timeArr[0]);
        arr[1] = Integer.parseInt(timeArr[1]);
        arr[2] = Integer.parseInt(timeArr[2]);
        if (arr[1] > 59 || arr[2] > 59) {
            System.out.println("invalid time");
            return;
        }
        while (arr[0] != 0 || arr[1] != 0 || arr[2] != 0) {
            try {
                if (arr[0] < 10) {
                    System.out.print("0" + arr[0] + ":");
                } else {
                    System.out.print(arr[0] + ":");
                }
                if (arr[1] < 10) {
                    System.out.print("0" + arr[1] + ":");
                } else {
                    System.out.print(arr[1] + ":");
                }
                if (arr[2] < 10) {
                    System.out.print("0" + arr[2] + "\r");
                } else {
                    System.out.print(arr[2] + "\r");
                }

                arr = decrease(arr);
                arr[2]--;
                Thread.sleep(1000);

            } catch (Exception e) {

            }
        }
        System.out.println("\r00:00:00");
    }

    public void stopWatch() {
        try {
            int sec = 0;
            int min = 0;
            int hour = 0;
            while (true) {
                if (hour < 10) {
                    System.out.print("0" + hour + ":");
                } else {
                    System.out.print(hour + ":");
                }
                if (min < 10) {
                    System.out.print("0" + min + ":");
                } else {
                    System.out.print(min + ":");
                }
                if (sec < 10) {
                    System.out.print("0" + sec + "\r");
                } else {
                    System.out.print(sec + "\r");
                }

                sec++;
                Thread.sleep(1000);
                if (sec == 60) {
                    min++;
                    sec = 0;
                }
                if (min == 60) {
                    hour++;
                    min = 0;
                }
            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

}