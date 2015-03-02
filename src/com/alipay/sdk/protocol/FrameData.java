package com.alipay.sdk.protocol;

import com.alipay.sdk.data.Request;
import com.alipay.sdk.data.Response;
import org.json.JSONObject;

public class FrameData
{
    private Request mRequest;
    private Response mResponse;
    private JSONObject mJson;

    public FrameData(Request request, Response response) {
        this.mRequest = request;
        this.mResponse = response;
    }

    // old name a
    public final Request getRequest() {
        return this.mRequest;
    }

    // old name b
    public final Response getResponse() {
        return this.mResponse;
    }

    // old name c
    public final JSONObject getJson() {
        return this.mJson;
    }

    // old name a
    public void setJson(JSONObject json) {
        this.mJson = json;
    }
}
