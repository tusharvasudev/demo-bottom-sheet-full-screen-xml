package com.demo.bottomsheetfullscreen

import android.app.Dialog
import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var dialogBox : BottomSheetDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialogBox = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        dialogBox.setCancelable(false)
        dialogBox.setCanceledOnTouchOutside(false)
        dialogBox.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        dialogBox.behavior.isDraggable = false
        return dialogBox
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelButton = view.findViewById<Button>(R.id.cancel_button)
        cancelButton.setBackgroundColor(resources.getColor(R.color.design_default_color_primary))
        cancelButton.setTextColor(resources.getColor(R.color.design_default_color_on_primary))

        cancelButton.setOnClickListener {
            dialogBox.cancel()
        }
    }

}