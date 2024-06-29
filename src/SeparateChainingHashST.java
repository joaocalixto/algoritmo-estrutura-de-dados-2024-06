public class SeparateChainingHashST<Key, Value> {

    private int m;
    private SequentialSearchST<Key, Value>[] st;

    public SeparateChainingHashST(int m) {
        this.m = m;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[m];
        for (int i = 0; i < m; i++)
            st[i] = new SequentialSearchST<>();
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }

    public void delete(Key key) {

        /*
        A classe SeparateChainingHashST contem um array de SequentialSearchST
        a funcao hash vai indicar em quql posicao a chave se encontra
        e vai removela sem a necessidade de alteração no array de SequentialSearchST
         */

        /*
        Para calcular a complexidade de tempo do método deletem é necessário
        analisar o método hash e o método delete da classe SequentialSearchST
        O metodo hash tem complexidade O(1), pq apenas executa uma operção computacional de %
        e na linha seguinta acessamos diretamento a posicao do hash na tabela hash
        O método delete da classe SequentialSearchST tem complexidade O(N) pq ele percorre.
        Então no pior caso a complexidade do método delete é O(N)
         */
        int i = hash(key);
       // st[i].delete(key);
    }
}
