package api;

import model.*;

public interface DesignInterface {

    /**
     * 保存design
     * method : post
     *
     * @param param
     * @return
     */
    AddDesignRes design(AddDesignReq param);

    /**
     * 更新design
     * method : put
     *
     * @param param
     * @return
     */
    UpdateDesignRes design(UpdateDesignReq param);

    /**
     * 删除design
     * method : get
     *
     * @param id
     * @return
     */
    DeleteDesignRes delete(String id);






}
