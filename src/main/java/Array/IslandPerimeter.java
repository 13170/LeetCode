package Array;

/***
 * 岛屿的周长   递归 DFS
 *
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 *
 *
 * 示例 :
 *
 * 输入:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * 输出: 16
 */
public class IslandPerimeter {

    public static void main(String[] args) {
        int [][] arry = {{0,1,0,0},
                         {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}} ;

        System.out.println(islandPerimeter(arry));

    }

    private static int islandPerimeter(int [][] arry){

        for (int i=0;i<arry.length;i++){
            for (int j = 0; j<arry[0].length; j++){
                if (arry[i][j] ==1){
                    return dfs(arry,i,j);
                }
            }
        }

        return 0;
    }

    /**
     *
     * @param arry
     * @param r
     * @param c
     * @return
     */
    private static int dfs(int [][] arry,int r,int c){

        // 基本的 DFS 框架：每次搜索四个相邻方格
        //dfs(arry,r-1,c);//上边相邻
        //dfs(arry,r+1,c);//下边相邻
        //dfs(arry,r,c-1);//左边相邻
        //dfs(arry,r,c+1);//右边相邻

        if(!((0<=r&&r<arry.length)&&(0<=c&&c<arry[0].length))){ //当岛屿为边界时，有效边+1
            return 1;
        }
        if(arry[r][c] == 0){ //相邻为水域时，有效边+1
            return 1;
        }
        if(arry[r][c] !=1){
            return 0;
        }
        arry[r][c] =2; // 将方格标记为已遍历

        return dfs(arry,r-1,c) + dfs(arry,r+1,c) + dfs(arry,r,c-1)+dfs(arry,r,c+1);

    }
}
