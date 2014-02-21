package di.madgik.cloudb.query;

import com.foundationdb.sql.query.SQLQuery;

/**
 * Created by panossakkos on 2/21/14.
 */

public class CloudQuery {

    public SQLQuery sqlQuery;

    public RootQuery rootQuery = new RootQuery();
    public InternalQuery internalQuery = new InternalQuery();
    public LeafQuery leafQuery = new LeafQuery();

    public CloudQuery(SQLQuery sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    @Override
    public String toString () {
        StringBuilder output = new StringBuilder();

        output.append("Root query:\n");
        output.append(rootQuery);
        output.append("\nInternal query:\n");
        output.append(internalQuery);
        output.append("\nLeaf query:\n");
        output.append(leafQuery);

        return output.toString();
    }
}
