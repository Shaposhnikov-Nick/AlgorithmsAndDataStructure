package Alishev;

/*
имеем расстояние между заправками и количество км, проехжаемых автомобилем на одном баке.
посчитать путь с минимальным количеством остановок для дозаправки
 */
public class GreedyAlgorithms2 {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};
        int capacity = 400;
        System.out.println(minStops(stations, capacity));
    }

    // return -1 if It is impossible to get from A to B
    public static int minStops(int[] stations, int capacity) {
        int result = 0; // минимальное коичество остановок
        int currentStop = 0; //место, где сейчас авто

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1
                    && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }

        return result;
    }
}

