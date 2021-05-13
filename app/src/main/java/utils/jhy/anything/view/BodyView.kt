package utils.jhy.anything.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import utils.jhy.anything.R

/**
 * Created by hayoung on 5/13/21.
 * gkduduu@naver.com
 * View of the body.
 */
class BodyView : ConstraintLayout {
    constructor(context: Context?) : super(context!!) {
        initView()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs) {
        initView()
    }

    private fun initView() {
        val infService = Context.LAYOUT_INFLATER_SERVICE
        val li = context.getSystemService(infService) as LayoutInflater
        val v = li.inflate(R.layout.view_body, this, false)
        addView(v)
    }
}