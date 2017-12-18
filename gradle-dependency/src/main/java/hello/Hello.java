package hello;

import java.sql.*;
import org.joda.time.DateTime;
import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Hello {
    Cache<String, List<String>> poiCache = CacheBuilder.newBuilder().build();

    @SuppressWarnings("unchecked")
    public List<String> getPOIList(final String cityId) throws ExecutionException {
        List<?> returnList = null;
        returnList = poiCache.get(cityId, new Callable<List<String>>() {
            @Override
            public List<String> call() throws InterruptedException {
                return getPOIListFromDB(cityId);
            }
        });
        return Optional.fromNullable(returnList).or(Collections.EMPTY_LIST);
    }

    @SuppressWarnings("unchecked")
    private List<String> getPOIListFromDB(String cityId) throws InterruptedException {
        System.out.println("getting from DB, please wait...");
        List<String> returnList = null;
        Thread.sleep(1000);
        switch (cityId) {
            case "0101":
                returnList = ImmutableList.of("Aba", "IO", "Axe", "Anti-mega");
                break;
            case "0102":
                returnList = ImmutableList.of("a", "b", "c", "d");
                break;
        }
        return Optional.fromNullable(returnList).or(Collections.EMPTY_LIST);
    }

    public static void main(String[] args) throws ExecutionException {
        Hello dao = new Hello();

        for (int i = 0; i < 3; i++) {
            System.out.println("--- " + i + " ---");
            System.out.println(Arrays.toString(dao.getPOIList("0101").toArray()));
            System.out.println(Arrays.toString(dao.getPOIList("0102").toArray()));
            System.out.println(Arrays.toString(dao.getPOIList("0103").toArray()));
            DateTime dateTime2000Year = new DateTime(2000, 2, 29, 0, 0, 0);
            System.out.println(dateTime2000Year);
        }
    }
}
