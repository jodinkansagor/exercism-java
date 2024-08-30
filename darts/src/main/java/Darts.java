class Darts {
    double distanceFromOrigin (double xValue, double yValue) {
        return Math.sqrt(Math.pow(xValue, 2) + Math.pow(yValue, 2));
    }

    int score(double xOfDart, double yOfDart) {
        double distance = distanceFromOrigin(xOfDart, yOfDart);
        int score = 0;
        if(distance <= 1) {
            score = 10;
        } else if (distance > 1 && distance <= 5) {

            score = 5;
        } else if (distance > 5 && distance <= 10) {
            score = 1;
        }

        return score;
    }
}
