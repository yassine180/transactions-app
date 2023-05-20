package ma.ensa.transactions_v2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="transactions")
@Data
public class Transaction implements Serializable {
    @Id
    private String ref,cptDeb,cptCred,date,type;
    private double montant;
    public Transaction(String ref, String cptDeb, String cptCred, double montant) {
        super();
        this.ref = ref;
        this.cptDeb = cptDeb;
        this.cptCred = cptCred;
        this.montant = montant;

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.date = dateFormat.format(currentDate);

        if(this.cptDeb.subSequence(0, 3).equals(this.cptCred.subSequence(0, 3))){
            this.type = "VIRINT";
        }else {
            this.type = "VIRCHA";
        }
    }

    public Transaction() {
        super();
    }
}
