public class BlockChain {
    public static void main(String[] args) {
        Block genesisBlock = new Block("Hi im the first block", "0") ;
        Block secondBlock = new Block("Yo im the second block",genesisBlock.hash) ;
        Block thirdBlock = new Block("Hey im the third block",secondBlock.hash) ;
        System.out.println("genesisBlock.hash :"+genesisBlock.hash);
        System.out.println("secondBlock.hash : "+secondBlock.hash);
        System.out.println("thirdBlock.hash : "+thirdBlock.hash);


    }
}
