package com.konfigthis.client;

import com.konfigthis.client.api.InfoApi;

public class Xkcd {
    private ApiClient apiClient;
    public final InfoApi info;

    public Xkcd() {
        this(null);
    }

    public Xkcd(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.info = new InfoApi(this.apiClient);
    }

}
