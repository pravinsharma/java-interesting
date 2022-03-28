package com.test.app;

public class CharacterPyramid {
    char character = '*';
    char spacer = ' ';
    int height;

    public CharacterPyramid(int height) {
        this.height = height;
    }

    public CharacterPyramid(int height, char character) {
        this.height = height;
        this.character = character;
    }

    public void output() {
        int sp = 0;

        for (int h = 1; h <= this.height; h++) {
            sp = this.height - h;

            // fill spacers
            for (int i = 0; i < sp; i++) System.out.print(this.spacer);

            // fill characters
            for (int i = 1; i < h*2; i++) System.out.print(this.character);

            // new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new CharacterPyramid(6).output();
        new CharacterPyramid(6, '$').output();
    }
}
