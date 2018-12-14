const httpRequest = ({method = 'get', url = '', data = null, params = null}) => {
    return axios({
        method: method,
        url: url,
        data: data,
        params: params,
        headers: {'content-type': 'application/json;charset=UTF-8'}
    }).then(res => {
        if (res.status === 200 && res.data.code === '1000') {
            return {
                flag: 'success',
                data: res.data.body
            };
        } else {
            return {
                flag: 'fail',
                message: res.data.message
            };
        }
    }).catch(error => {
        return {
            flag: 'fail',
            message: '服务器异常!' + JSON.stringify(error)
        };
    });
};

/**
 * get request
 *
 * @param url request url
 * @param params get param
 * @returns success data
 */
function get({url, params = null}) {
    return httpRequest({method: 'get', url: url, params: params}).then(callback => {
        if (callback.flag === 'success') {
            return callback.data;
        } else {
            console.error(callback.message);
        }
    });
}

/**
 * post request
 *
 * @param url request url
 * @param data post param
 * @returns success data
 */
function post({url, data = null}) {
    httpRequest({method: 'post', url: url, data: data}).then(callback => {
        if (callback.flag === 'success') {
            return callback.data;
        } else {
            console.error(callback.message);
        }
    });
}