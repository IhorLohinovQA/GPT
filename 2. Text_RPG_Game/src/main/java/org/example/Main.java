package org.example;

public class Main {
    public static void main(String[] args) {
        int playerHealth = 100;
        int enemyHealth = 100;
        int playerAttack, enemyAttack;

        while (playerHealth > 0 && enemyHealth > 0) {
            System.out.println("Player health: " + playerHealth);
            System.out.println("Enemy health: " + enemyHealth);
            playerAttack = (int) (Math.random() * 10);
            enemyAttack = (int) (Math.random() * 10);
            System.out.println("Player damage: " + playerAttack);
            System.out.println("Enemy damage: " + enemyAttack);
            playerHealth -= enemyAttack;
            enemyHealth -= playerAttack;
            if (enemyHealth <= 0 && playerHealth <= 0) {
                System.out.println("Defeat for both");
                break;
            } else if (enemyHealth <= 0) {
                System.out.println("Defeat for enemy and Victory for player");
                break;
            } else if (playerHealth <= 0) {
                System.out.println("Defeat for player and Victory for enemy");
                break;
            }

        }

    }
}