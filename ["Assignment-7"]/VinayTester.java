/*  Student information for assignment:
 *
 *  Number of slip days used: 0
 *
 *  Student 1 (Student whose turnin account is being used): Vinay Valsaraj
 *  UTEID: vgv236
 *  email address: vinaygvalsaraj@gmail.com
 *  Grader name: Katherine Bruton
 *  Section number: 50978
 *
 *  Student 2: Rinchen Tsering
 *  UTEID: rt24459
 *  email address: rinchenut@utexas.edu
 *  Grader name: Katherine Bruton
 *  Section number: 50978
 *
 */


import java.util.ArrayList;
import java.util.Collections;

public class RecursiveTester {
    public static void main(String[] args) {
        Recursive r = new Recursive();
           
        studentTests(r);
        
    }

    // pre: r != null
    // post: run student test
    private static void studentTests(Recursive r) {
        
    	// CS314 students put your tests here
    	String actualBinary=r.getBinary(64);
    	String expectedBinary="1000000";
    	if( actualBinary.equals(expectedBinary) )
            System.out.println( "Test 1.1 passed. get binary.");
        else
            System.out.println( "Test 1.1 failed. get binary. expected: " + expectedBinary + ", actual: " + actualBinary);
    	
    	actualBinary=r.getBinary(71);
    	expectedBinary="1000111";
    	if( actualBinary.equals(expectedBinary) )
            System.out.println( "Test 1.1 passed. get binary.");
        else
            System.out.println( "Test 1.1 failed. get binary. expected: " + expectedBinary + ", actual: " + actualBinary);
    	
    	actualBinary=r.getBinary(1);
    	expectedBinary="1";
    	if( actualBinary.equals(expectedBinary) )
            System.out.println( "Test 1.1 passed. get binary.");
        else
            System.out.println( "Test 1.1 failed. get binary. expected: " + expectedBinary + ", actual: " + actualBinary);
    	
    	String actualRev=r.revString("Vinay Valsaraj");
    	String expectedRev="jaraslaV yaniV";
    	if( actualRev.equals(expectedRev) )
            System.out.println( "Test 2.1 passed. reverse string.");
        else
            System.out.println( "Test 2.1 failed. reverse string. expected: " + expectedRev + ", actual: " + actualRev);
    	
    	actualRev=r.revString("314 DATA STRUCTURES");
    	expectedRev="SERUTCURTS ATAD 413";
    	if( actualRev.equals(expectedRev) )
            System.out.println( "Test 2.2 passed. reverse string.");
        else
            System.out.println( "Test 2.2 failed. reverse string. expected: " + expectedRev + ", actual: " + actualRev);
    	
    	actualRev=r.revString("The123456789 quick brown $#@ jumped over the *&^ dog.");
    	expectedRev=".god ^&* eht revo depmuj @#$ nworb kciuq 987654321ehT";
    	if( actualRev.equals(expectedRev) )
            System.out.println( "Test 2.3 passed. reverse string.");
        else
            System.out.println( "Test 2.3 failed. reverse string. expected: " + expectedRev + ", actual: " + actualRev);
    	
    	int[] numsForDouble = {2, -4, -8, 16, -32, -64, 128};
        int actualDouble = r.nextIsDouble(numsForDouble);
        int expectedDouble = 2;
        if(actualDouble == expectedDouble)
            System.out.println( "Test 3.1 passed. next is double.");
        else
            System.out.println( "Test 3.1 failed. next is double. expected: " + expectedDouble + ", actual: " + actualDouble);


        numsForDouble = new int[]{0, 0, 1, 1, 2, 4, 16};
        actualDouble = r.nextIsDouble(numsForDouble);
        expectedDouble = 3;
        if(actualDouble == expectedDouble)
            System.out.println( "Test 3.2 passed. next is double.");
        else
            System.out.println( "Test 3.2 failed. next is double. expected: " + expectedDouble + ", actual: " + actualDouble);
        
        numsForDouble = new int[]{0, 0, 0, 0, 0};
        actualDouble = r.nextIsDouble(numsForDouble);
        expectedDouble = 4;
        if(actualDouble == expectedDouble)
            System.out.println( "Test 3.3 passed. next is double.");
        else
            System.out.println( "Test 3.3 failed. next is double. expected: " + expectedDouble + ", actual: " + actualDouble);
    	
        ArrayList<String> mnemonics = r.listMnemonics("12");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1A");
        expected.add("1B");
        expected.add("1C");
        
        if( mnemonics.equals(expected))
            System.out.println( "Test 4.1 passed. Phone mnemonics.");
        else
            System.out.println( "Test 4.1 failed. Phone mnemonics.");
        
        mnemonics=r.listMnemonics("34");
        expected.clear();
        expected.add("DG");
        expected.add("DH");
        expected.add("DI");
        expected.add("EG");
        expected.add("EH");
        expected.add("EI");
        expected.add("FG");
        expected.add("FH");
        expected.add("FI");
        
        if( mnemonics.equals(expected))
            System.out.println( "Test 4.2 passed. Phone mnemonics.");
        else
            System.out.println( "Test 4.2 failed. Phone mnemonics.");
        
        mnemonics=r.listMnemonics("411");
        expected.clear();
        expected.add("G11");
        expected.add("H11");
        expected.add("I11");
        
        if( mnemonics.equals(expected))
            System.out.println( "Test 4.3 passed. Phone mnemonics.");
        else
            System.out.println( "Test 4.3 failed. Phone mnemonics.");
        
        int[][] world = {{30,30,30,3,30,30},
                		{30,30,30,4,30,30},
                		{30,30,30,5,30,30},
                		{30,30,30,6,30,30},
                		{30,30,30,7,30,30},
                		{30,30,30,8,30,30},
                		{30,30,10,9,30,30},
                		{30,30,11,12,30,30}};

        if( r.canFlowOffMap(world, 6, 0))
            System.out.println( "Test 5.1 passed. can flow off map.");
        else
            System.out.println( "Test 5.1 failed. can flow off map.");
        
        if( !r.canFlowOffMap(world, 1, 1))
            System.out.println( "Test 5.2 passed. can flow off map.");
        else
            System.out.println( "Test 5.2 failed. can flow off map.");
        
        if( r.canFlowOffMap(world, 7, 3))
            System.out.println( "Test 5.3 passed. can flow off map.");
        else
            System.out.println( "Test 5.3 failed. can flow off map.");
        
        if( r.canFlowOffMap(world, 5, 2))
            System.out.println( "Test 5.4 passed. can flow off map.");
        else
            System.out.println( "Test 5.4 failed. can flow off map.");
        
        if( r.canFlowOffMap(world, 0, 2))
            System.out.println( "Test 5.5 passed. can flow off map.");
        else
            System.out.println( "Test 5.5 failed. can flow off map.");
        
        if( r.canFlowOffMap(world, 0, 5))
            System.out.println( "Test 5.6 passed. can flow off map.");
        else
            System.out.println( "Test 5.6 failed. can flow off map.");
        
        if( r.canFlowOffMap(world, 6, 2))
            System.out.println( "Test 5.7 passed. can flow off map.");
        else
            System.out.println( "Test 5.7 failed. can flow off map.");
        
        if( !r.canFlowOffMap(world, 4, 1))
            System.out.println( "Test 5.8 passed. can flow off map.");
        else
            System.out.println( "Test 5.8 failed. can flow off map.");
        
        int[] abilities = {0, 0};
        if(r.minDifference(2, abilities) == 0)
            System.out.println( "Test 6.1 passed. min difference.");
        else
            System.out.println( "Test 6.1 failed. min difference.");

        abilities = new int[]{5, 5, 10, 10};
        if(r.minDifference(4, abilities) == 5)
            System.out.println( "Test 6.2 passed. min difference.");
        else
            System.out.println( "Test 6.2 failed. min difference.");

        abilities = new int[]{5, 5, 10, 10};
        if(r.minDifference(6, abilities) == Integer.MAX_VALUE)
            System.out.println( "Test 6.3 passed. min difference.");
        else
            System.out.println( "Test 6.3 failed. min difference.");
        
        
        String puzzle1 = "020000000000600003074080000000003002080040010600500000000010780500009000000000040";
        int[][] board = stringToBoard(puzzle1);
        int[][] result = r.getSudokoSolution(board);
        String actualBoard = boardToString(result);
        String expectedBoard = "126437958895621473374985126457193862983246517612578394269314785548769231731852649";
        if(actualBoard.equals(expectedBoard))
            System.out.println( "Test 7.1 passed. sudoko solver.");
        else {
            System.out.println("Test 7.1 failed. sudoku solver:");
            System.out.println("Expected board:");
            printBoard(stringToBoard(expectedBoard));
            System.out.println();
            System.out.println("Actual board:");
            printBoard(result);
        }
        
        String puzzle2 = "000600400700003600000091080000000000050180003000306045040200060903000000020000100";
        board = stringToBoard(puzzle2);
        result = r.getSudokoSolution(board);
        actualBoard = boardToString(result);
        expectedBoard = "581672439792843651364591782438957216256184973179326845845219367913768524627435198";
        if(actualBoard.equals(expectedBoard))
            System.out.println( "Test 7.2 passed. sudoko solver.");
        else {
            System.out.println("Test 7.2 failed. sudoku solver:");
            System.out.println("Expected board:");
            printBoard(stringToBoard(expectedBoard));
            System.out.println();
            System.out.println("Actual board:");
            printBoard(result);
        }
        
        String puzzle3 = "200300000804062003013800200000020390507000621032006000020009140601250809000001002";
        board = stringToBoard(puzzle3);
        result = r.getSudokoSolution(board);
        actualBoard = boardToString(result);
        expectedBoard = "276314958854962713913875264468127395597438621132596487325789146641253879789641532";
        if(actualBoard.equals(expectedBoard))
            System.out.println( "Test 7.3 passed. sudoko solver.");
        else {
            System.out.println("Test 7.3 failed. sudoku solver:");
            System.out.println("Expected board:");
            printBoard(stringToBoard(expectedBoard));
            System.out.println();
            System.out.println("Actual board:");
            printBoard(result);
        }
        
        
    	
    }

    private static String boardToString(int[][] board) {
        StringBuilder result = new StringBuilder(81);
        for(int r = 0; r < board.length; r++)
            for(int c = 0; c < board[r].length; c++)
                result.append(board[r][c]);
        return result.toString();
    }

    private static int[][] stringToBoard(String puzzle) {
        int[][] result = new int[Recursive.BOARD_SIZE][Recursive.BOARD_SIZE];
        int index = 0;
        for(int r = 0; r < result.length; r++)
            for(int c = 0; c < result.length; c++, index++)
                result[r][c] = puzzle.charAt(index) - '0';
        return result;
    }

    private static void printBoard(int[][] board) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}