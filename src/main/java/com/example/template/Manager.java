package com.example.template;

public class Manager {
    private Tile[][] tiles = new Tile[3][3];
    private int whoGo = 0;

    public Manager() {
        for (int i = 0 ; i< 3; i++){
            for (int j = 0 ; j< 3; j++){
                tiles[i][j] = new Tile("-fx-background-color: #ffff7c");
            }
        }
    }


    public int checkwin(){
        for (int i = 0 ; i< 3; i++){
            if(tiles[0][i].getTileColor().equals(tiles[1][i].getTileColor()) &&tiles[1][i].getTileColor().equals(tiles[2][i].getTileColor()) && !tiles[0][i].getTileColor().equals("-fx-background-color: #ffff7c")){
                return 1;

            }
            if(tiles[i][0].getTileColor().equals(tiles[i][1].getTileColor()) &&tiles[i][1].getTileColor().equals(tiles[i][2].getTileColor()) && !tiles[i][0].getTileColor().equals("-fx-background-color: #ffff7c")){
                return 1;

            }

        }
        return 2;

    }

    public int getWhoGo() {
        return whoGo;
    }

    public void changeWhoGo(){
        if(whoGo == 0){
            whoGo =1;
        }else {
            whoGo = 0;
        }
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public Tile getTile(int i, int j) {
        return tiles[i][j];

    }
    public void setTileC(int i, int j) {
        if (whoGo == 0){
            tiles[i][j].setTileColor("-fx-background-color: #ff7c7c");
        }else {
            tiles[i][j].setTileColor("-fx-background-color: #7cffeb");

        }

    }
}
