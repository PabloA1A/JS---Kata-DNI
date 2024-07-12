package dev.pablo;

public class NationalDNI {
    private static final String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
    private int number;
    private char letter;

    public char calculateLetter(int number) {
        if (number < 0 || number > 99999999) {
            throw new IllegalArgumentException("ID number must be between 0 and 99999999");
        }
        this.number = number;
        int index = number % 23;
        this.letter = letters.charAt(index);
        return this.letter;
    }

    public String getFullDNI() {
        if (this.number == 0 || this.letter == '\0') {
            return null; 
        }
        return String.format("%08d-%c", this.number, this.letter);
    }
}
