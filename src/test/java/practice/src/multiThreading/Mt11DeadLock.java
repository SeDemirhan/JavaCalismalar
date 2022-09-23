package practice.src.multiThreading;

public class Mt11DeadLock {
    /*  ===================================================== DEADLOCK======================================================
        Deadlock aslında bir kısır döngüdür ve karşılıklı thread'lerin kilitlediği kaynakların salınmasının beklemesi ile
        oluşur.

        DeadLock genelde nested (iç içe) kaynak erişimi sırasında oluşur. Birbirinde habersiz Thread'ler ters sırada
        kaynaklara nested olarak erişmek isterse DeadLock oluşması muhtemeldir.

        DeadLock'dan kacınmak icin
        - Nested kaynak erişimi yapılmamalıdır.
        - Bir kaynağı kilitleyen Thread'in O kaynağı bırakmadan başka bir kaynağa erişimi engellenebilir.
     */

   // task eszmanli erilsilecek threadler create edin
    // iki tane thread create edip bu kaynalara ersim run edin


}