package <%= package_name %>.presentation.helper

import android.content.Context
import javax.inject.Inject
import javax.inject.Named

class DialogHelper @Inject constructor(@Named("activityContext") val context: Context)