import java.util.Date;
public class Block {
    public String hash;
    public String previousHash;
    public String data;
    public Long timeStamp;

    Block(String data, String previousHash ){
    this.previousHash = previousHash;
    this.data = data;
    this.hash = calculateHash();
    this.timeStamp = new Date().getTime();
    }

    public String calculateHash() {

        String calculatedhash = StringUtil.applySha256(
                previousHash+data+
                        timeStamp
        );
        return calculatedhash;
    }

    }

