public class ArraySearch {

    public static void main(String[] args) {
        // Das Array lesen
        int[] array = leseArray();

        // Das Array sortieren
        

        // Die gesuchte Zahl finden
        int gesuchteZahl = Integer.parseInt(System.console().readLine("Gesuchte Zahl: "));
        int position = binarySearch(array, gesuchteZahl);

        // Das Ergebnis ausgeben
        if (position != -1) {
            System.out.println("Die gesuchte Zahl befindet sich an der Position " + position);
        } else {
            System.out.println("Die gesuchte Zahl wurde nicht gefunden");
        }
    }

    private static int[] leseArray() {
        // Die Anzahl der Elemente im Array abfragen
        System.out.println("Anzahl der Elemente: ");
        int anzahlElemente = Integer.parseInt(System.console().readLine());

        // Ein Array mit der gewünschten Anzahl an Elementen erstellen
        int[] array = new int[anzahlElemente];

        // Die Elemente des Arrays einlesen
        for (int i = 0; i < anzahlElemente; i++) {
            System.out.println("Element " + i + ": ");
            array[i] = Integer.parseInt(System.console().readLine());
        }

        return array;
    }

    public static int[] merge(int[] links, int[] rechts,int[] array) {
        int[] sortiert = new int[links.length + rechts.length];
        
        int i = 0; 
        int j = 0; 
        int k = 0; 

        while (i < links.length && j < rechts.length) {
            if (links[i] <= rechts[j]) {
                sortiert[k] = links [i]; 
                i++;
            } else {
                sortiert[k] = rechts[j];
                j++;
            }
            k++;
        }
        while (i < links.length) {
            sortiert[k] = links[i];
            i++;
            k++;
        }
        while (j < rechts.length) {
            sortiert[k] = rechts[j];
            j++;
            k++;
        }

        return sortiert;
    }

    private static int binarySearch(int[] array, int gesuchteZahl) {
        // Den Anfang und das Ende des Arrays festlegen
        int start = 0;
        int end = array.length - 1;

        // Solange der Suchbereich nicht leer ist
        while (start <= end) {
            // Die mittlere Position des Suchbereichs berechnen
            int mitte = (start + end) / 2;
            // Vergleichen Sie die gesuchte Zahl mit dem Element an der mittleren Position
            if (gesuchteZahl == array[mitte]) {
                // Die gesuchte Zahl wurde gefunden
                return mitte;
            } else if (gesuchteZahl < array[mitte]) {
                // Die gesuchte Zahl befindet sich im linken Teil des Suchbereichs
                end = mitte - 1;
            } else {
                // Die gesuchte Zahl befindet sich im rechten Teil des Suchbereichs
                start = mitte + 1;
            }
        }

        // Die gesuchte Zahl wurde nicht gefunden
        return -1;
    }
}