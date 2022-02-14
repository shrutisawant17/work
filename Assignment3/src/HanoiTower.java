class HanoiTower
{
    public static void main(String[] args)
    {
        hanoi(3, 'A', 'B', 'C');
    }

    private static void hanoi(int n, char rodFrom, char rodMiddle, char rodTo)
    {

        if (n == 1)
        {
            System.out.println("Disk 1 moved from " + rodFrom + " to " + rodTo);
            return;
        }
        hanoi(n - 1, rodFrom, rodTo, rodMiddle);
        System.out.println("Disk " + n + " moved from " + rodFrom + " to " + rodTo);
        hanoi(n - 1, rodMiddle, rodFrom, rodTo);

    }
}